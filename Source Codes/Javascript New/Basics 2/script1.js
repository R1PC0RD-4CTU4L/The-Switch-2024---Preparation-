/*Arrays Basics*/

let a = ['Cypher', 'Killjoy', 'Deadlock', 'Chamber', 'Sage'];

/*Another way to create Array */

let b = new Array('Sova', 'Gekko', 'Breach', 'Fade');

console.log(b);
console.log(typeof (b));

/*Accessing Elements */

console.log(b[0]);
console.log(b[1]);
console.log(b[2]);
console.log(b[3]);

/*Calculating length Of Array */

console.log(b.length);

/*Arrays IN JS Are Heterogeneous */

let array1 = ['Sagnik', 1998, 'Software Engineer', false, 2023 - 1998];
console.log(array1);

/*Even arrays can be added within the  */

let array2 = [b, 'Omen', 'Harbor', 'Viper', 'Brimstone'];
console.log(array2);

/*Accessing Elements Of the Inner Array */

console.log(array2[0][1]);

/*Iterating An Array */

for (let i = 0; i < a.length; i++) {
    process.stdout.write(a[i] + " ");
}





