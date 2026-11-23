let generateBtn = document.getElementById("generatebtn");
let clearBtn = document.getElementById("clearbtn");
let tableContainer = document.getElementById("tableContainer");

if (generateBtn) {
    generateBtn.addEventListener('click', () => {
        tableContainer.innerHTML = '';

        const row = parseInt(document.getElementById("rowInput").value, 10);
        const column = parseInt(document.getElementById("columnInput").value, 10);

        if (isNaN(row) || isNaN(column) || row <= 0 || column <= 0) {
            alert('Please enter valid positive row and column values.');
            return;
        }

        const table = document.createElement('table');

        for (let r = 0; r < row; r++) {
            const tr = document.createElement('tr');

            for (let c = 0; c < column; c++) {
                const td = document.createElement('td');
                td.textContent = `R ${r} C ${c}`;
                tr.appendChild(td);
            }

            table.appendChild(tr);
        }

        tableContainer.appendChild(table);
    });
}

if (clearBtn) {
    clearBtn.addEventListener('click', () => {
        tableContainer.innerHTML = '';
    });
}

