//
//Приложение = Backend + Frontend
// Backend:
// - храниение(DB - SQL, MongoDB)
// - передача данных
// - безопасность
// - валидация

// Frontend:
// - красивый и удобный UI
// - создается формы для отправки

// Схематичные(только для понятия концепции примеры) запросов:
// реальные запросы будем делать позже

// post method
const postAuthData = (url, data) => {
    // post(url, data);
}

// get method
const getTV = (url) => {
    // post(`${url}/TV`);
}

//Lesson 10 Task 1

const findIndexInArray = (array, index) => array[index];

const value = findIndexInArray([5, 6, 7, 8], 2);
console.log(value);
console.log(findIndexInArray([5, 6, 7, 8], 2));

//Lesson 10 Task2

const sumArray = (arr1, arr2) => [...arr1, ...arr2];

console.log(sumArray([1, 2, 3], [4, 5, 6]));

// Spread and object example

const a = {
  name: "Gleb",
 age:29
};

const b = {...a} 
a.name = "Kate";

console.log(a, b);

//Lesson 11: task 1

const personalArray = [
  { name: "Alex", job: "QA" },
  { name: "Brat", job: "Frontend" },
  { name: "Homer", job: "PM" },
  { name: "Oleh", job: "QA" },
  { name: "Eddie", job: "Frontend" },
  { name: "Bart", job: "Backend" },
];

const first4Elements = personalArray.filter((_, index) =>index <=3);

console.log(first4Elements);


//  split() and join()

const str = "Вася, Петя, Маша";
const arrayOfNames =str.split(', ').reverse();

console.log(arrayOfNames.join(', '));



