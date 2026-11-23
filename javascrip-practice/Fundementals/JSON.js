

// JSON.Stringify(): Converts a JavaScript object into a JSON string.
// JSON.Parse(): Converts a JSON string back into a JavaScript object.

async function updateUserProfile() {
  // 1. CREATE: Build your data object
  const updatedData = {
    username: "newUser123",
    preferences: {
      theme: "dark",
      notifications: true
    }
  };
  
  // 2. CONVERT: Turn it into JSON for the wire
  const payload = JSON.stringify(updatedData);
  
  try {
    // 3. SEND: POST it to an API
    const response = await fetch('https://httpbin.org/post', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: payload
    });
    
    // 4. READ: Parse the JSON response
    const result = await response.json();
    
    console.log("Server received:", result.data);
    // Server echoes back: {"username":"newUser123","preferences":{"theme":"dark"...
    
  } catch (error) {
    console.error("Network error:", error);
  }
}

updateUserProfile();