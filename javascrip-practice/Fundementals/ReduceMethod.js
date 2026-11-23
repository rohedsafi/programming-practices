

const Prises = [ 10 , 12, 9, 5, 50, 4];

const getInfo = Prises.reduce((total , value) =>  total + value );
console.log(getInfo);


//=======================================================

const fruits = ["apple" ,"Banana" , "Kiwi", "apple" , "Kiwi" , "orange"];

const count = fruits.reduce((total , nextElement) => {
    total[nextElement] = (total[nextElement] || 0) + 1;
    // if(total[nextElement] ){
    //     total[nextElement] = totalElement + 1;
    // }else{
        // total[nextElement] = 1;
        return total;
    // }
}, {});

console.log(count)