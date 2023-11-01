// let, const, var
let cat = 'Murzik';
cat = "Vas`ka";

const IBAN = 123123;
const nan = NaN;
console.log(typeof nan);

// string, boolean, bigint, number
// undefined, null
// symbol

let a;
a = 10;

const b = 10;

const arr = [];

arr[0] = "apple";
arr[1] = "orange";
console.log(arr[2]); // undefined

// push - добавление в конец
const length = arr.push("kiwi");
console.log(length);
console.log(arr);  // [ 'apple', 'orange', 'kiwi' ]
// pop - удаляет элемент из конца
const kiwi = arr.pop();

// unshift - добавление в начало
// shift   - удаление из начала - и получения этого элемента

// 


function print(){
  console.log("Phrase");
  // return;
}

function sum(a, b){
  return a + b;
}

let res = sum(10, 15);

let res2 = print();
console.log(res2); // undefined

// Пример
let x = 10;
let toggle = true;

function increase(){
  if(toggle){
    x +=2;
  } else {
    x++;
  }
  toggle = !toggle;
}

increase();     // +2
console.log(x); // 12
increase();     // +1
console.log(x); // 13

