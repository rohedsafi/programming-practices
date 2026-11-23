"use strict";

const TOKEN_STORAGE_KEY = "securityPracticeToken";
const API_BASE_URL = "http://localhost:8080";

document.querySelectorAll("[data-auth-form]").forEach((form) => {
    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const formData = new FormData(form);
        const username = String(formData.get("username") || "").trim();
        const password = String(formData.get("password") || "");
        const isSignup = form.dataset.authForm === "signup";
        const message = form.querySelector("[data-message]");
        const button = form.querySelector('button[type="submit"]');

        message.textContent = "";
        message.classList.remove("success");

        if (isSignup && password !== formData.get("confirmPassword")) {
            message.textContent = "The passwords do not match.";
            return;
        }

        button.disabled = true;

        try {
            const response = await fetch(
                `${API_BASE_URL}${isSignup ? "/register" : "/login"}`,
                {
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({ username, password })
                }
            );

            const responseBody = (await response.text()).trim();
            if (!response.ok) {
                throw new Error(responseBody || `Request failed (${response.status}).`);
            }

            if (isSignup) {
                message.textContent = "Account created. You can now sign in.";
                message.classList.add("success");
                form.reset();
                return;
            }

            const token = responseBody.startsWith('"')
                ? JSON.parse(responseBody)
                : responseBody;
            if (typeof token !== "string" || token.length === 0) {
                throw new Error("Sign-in succeeded but the server did not return a token.");
            }

            localStorage.setItem(TOKEN_STORAGE_KEY, token);
            message.textContent = "Signed in successfully.";
            message.classList.add("success");
        } catch (error) {
            message.textContent = error instanceof TypeError
                ? "Could not reach the server. Make sure the application is running."
                : error.message;
        } finally {
            button.disabled = false;
        }
    });
});
