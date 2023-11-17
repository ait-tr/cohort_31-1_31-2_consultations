// 3 способ: экспорт непосредственно перед обявлением переменной
export const sum = (a, b) => a + b;
const minus = (a, b) => a - b;
const division = (a, b) => {
  if (b !== 0) {
    return a / b;
  }
};

const multiplication = (a, b) => a * b;

// 1 спобоб - экспорт как переменные, через фигурные скобки
// в типорте забирается как import {sum, minus, division} from './helpers'
export { minus, division };

// 2 способ: экспорт как default
// Когда экспортируем, указываем имя точно
// Идея в том, что когда импортируем нам не обязательно указывать точное имя
// Нельзя делать более 1 дефолта в одном файле
// imort multi from './helpers';
export default multiplication;
