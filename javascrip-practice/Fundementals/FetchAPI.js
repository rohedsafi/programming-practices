
// async function getData() {
//     try {
//         const response = await fetch('https://reqres.in/api/users/2'); // this line will wait for the fetch request to complete and return a Response object    
//         if (!response.ok){
//             throw new Error(`HTTP error! status`);
//         }

//         const data = await response.json() // this line will parse the response body as JSON and return a JavaScript object
//         console.log(data)
        
//     } catch (error) {
//         console.error(error);
//     }
// }

// getData()

async function fetchData() {
    const response = fetch('https://jsonplaceholder.typicode.com/todos/1' , {
        method: 'POST', // specifies the HTTP method to be used for the request. In this case, it's a POST request, which is typically used to send data to a server to create or update a resource.
        headers: { // specifies the headers to be included in the request. Headers provide additional information about the request or the data being sent. In this case, it sets the 'Content-Type' header to 'application/json', indicating that the request body will contain JSON data.
                'Content-Type': 'application/json'},
        body: JSON.stringify({  name: 'John Doe', job: 'Software Engineer' }) // It converts a JavaScript object or value to a JSON string
    })
    .then(response =>{
        if( response.ok){
            return response.json()
        }else{
            throw new Error(`HTTP error! status: ${response.status}`);
        }
    })
    .then(result =>{
        console.log(result)
    })
    
}
fetchData()