
 async function processData() {
            try {
                console.log("processing data");

                const response = await fetch("https://jsonplaceholder.typicode.com/users")
                if(!response.ok){
                    throw new Error("failed to fetch data")
                }
                const data = await response.json();

                const processData = data.map(user => ({
                    id: user.id,
                    name: user.name,
                    email: user.email

                }));

                console.log("processed data: ", processData);
                return processData;


            } catch (error) {
                console.error("Processing error" , error.message)
            }
            
        }


        document.getElementById("load-btn").addEventListener('click', async () =>{
            const container = document.getElementById('card-container');
            container.innerHTML = "";

            const users = await processData();

            if(users && users.length > 0){
                users.forEach(user => {
                    const card = document.createElement('div');
                    card.className = 'card';
                    card.innerHTML = `
                    <div class=id-badge>ID: ${user.id}</div> 
                    <h3> ${user.name} </h3>
                    <p><strong> Email:</strong> ${user.email}</p>`;
                    container.appendChild(card)
                    
                });

            }else{
                container.innerHTML = `<p> No data found or an error occurred`
            }

        })