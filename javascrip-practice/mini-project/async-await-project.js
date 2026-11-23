const logElement = document.getElementById('log');
const startButton = document.getElementById('startButton');

const stocks = {
    fruit: ['Apple', 'Banana', 'Watermelon'],
    liquid: ['Water', 'Ice'],
    container: ['cup', 'glass']
};

function addLog(message) { // Function to add log messages to the log element
    logElement.textContent += message + '\n'; // Append the message to the log element
    logElement.scrollTop = logElement.scrollHeight;  // Scroll to the bottom of the log element to show the latest message
}

function wait(ms) { // Helper function to create a delay
    return new Promise((resolve) => setTimeout(resolve, ms));
}

function prepareIngredient(name, delay) {
    return new Promise((resolve, reject) => {
        addLog(`Checking ingredient: ${name}`);
        if (!stocks.fruit.includes(name) && !stocks.liquid.includes(name) && !stocks.container.includes(name)) {
            reject(new Error(`${name} is not available`)); // Reject the promise if the ingredient is not available
            return; // Exit early if the ingredient is not available
        }

        setTimeout(() => {
            resolve(`${name} ready`);
        }, delay);
    });
}

async function makeDrink() {
    try {
        addLog('Order received. Starting preparation...');

        const fruitResult = await prepareIngredient('Apple', 1200); // Wait for the fruit to be prepared
        addLog(fruitResult); // Log the result of the fruit preparation

        const waterResult = await prepareIngredient('Water', 8000); // Wait for the water to be prepared
        addLog(waterResult); // Log the result of the water preparation

        const iceResult = await prepareIngredient('Ice', 8000);
        addLog(iceResult);

        const containerResult = await prepareIngredient('cup', 5000);
        addLog(containerResult);

        await wait(7000); // Simulate the time taken to assemble the drink
        addLog('Drink assembled and ready to serve!');
    } catch (error) {
        addLog(`Order failed: ${error.message}`);
    } finally {
        addLog('Order process finished.');
    }
}

startButton.addEventListener('click', () => {
    logElement.textContent = '';
    makeDrink();
});
