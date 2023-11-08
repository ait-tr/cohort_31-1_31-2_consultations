// 1. removeById
const div = document.getElementById("hello-world");
console.log(div);

div.remove();

// 2. removeByClass.

const divs = document.getElementsByClassName("hello");

console.log(divs);

divs[0].remove();

// 3. если мы хотим удалить весь список, то оберните список в обертку.
// например: у вас список из 5 <li></li>
// т.к у вас все обернуто в <ul id="numbers"></ul>
// то находите ul по id:
// затем удаляем весь список

const listElemnts = document.getElementById("numbers");
const deleteButton = document.getElementById("delete-button");

const clearList = () => {
  while (listElemnts.hasChildNodes()) {
    listElemnts.firstChild.remove(); // удаляет элементы списка пока они есть
  }
};

// удаляем все элементы списка
deleteButton.addEventListener("click", clearList);

// массывы
// Создаем массив обьектов persons
const persons = [
  { id: 1, name: "Kirill", age: 29 },
  { id: 2, name: "Kate", age: 25 },
  { id: 3, name: "Kirill", age: 35 },
  { id: 4, name: "Alex", age: 40 },
  { id: 5, name: "Oleh", age: 28 },
];

// Делаем поверхносное клонирование persons в новую переменную
const newPersons = [
  // делаем глубокое клонирование
  ...persons.map((person) => {
    const clonePerson = { ...person };

    return clonePerson;
  }),
];
const kirill = persons.find((person) => person.id === 1);

kirill.age = 30;

console.log(kirill);
console.log(persons);
console.log(newPersons);
