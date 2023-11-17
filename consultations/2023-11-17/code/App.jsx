import "./App.css";
import Button from "./components/Button";
import Modal from "./components/Modal";

export const animal = "Dog";

function App() {
  // JSX позволят нам создавать переменные и передавать туда теги
  const name = <p>My name is Gleb</p>;
  const job = "Frontend developer";
  const tegJobId = "job";

  const characters = {
    hair: "black",
    height: "185",
  };

  const sum = (a, b) => a + b;

  const numberOfFriends = (count) => {
    if (count > 5) {
      return `У вас ${count} друзей`;
    } else {
      return "У вас менее 5 друзей";
    }
  };

  const rich = true;

  const buttonNames = [
    "Отправить",
    "Получить товар",
    "Купить",
    "Заказать",
    "Продать",
  ];

  const buttons = buttonNames.map((value) => {
    console.log(value);
    return (
      <div className="button-container">
        <Button name={value} />
      </div>
    );
  });

  console.log(buttons);

  return (
    <div className="App">
      {/* {name}
      <p id={tegJobId}>I am {job}</p>
      <p>Возвращаемая сумма: {sum(2, 2)}</p>
      <p>Характеристики</p>
      <ul>
        <li>Цвет волос: {characters.hair}</li>
        <li>Рост:{characters.height} </li>
      </ul>
      <p>Favorite animal:{animal}</p>
      <div>{numberOfFriends(7)}</div>
      <div>{rich ? "Вы богатый" : "Вы не в достатке"}</div> */}
      <Modal>
        <p>Name: Alex</p>
        <p>Age: 28</p>
        {numberOfFriends(6)}
      </Modal>
      <Modal>
        <div className="button-container">
          <Button name="Отправить" type="submit" />
        </div>
        <div className="button-container">
          <Button name="Получить товар" type="submit" />
        </div>
        {}
      </Modal>
      {/* <div className="button-container">
        <Button name="Отправить" />
      </div>
      <div className="button-container">
        <Button name="Получить товар" />
      </div>
      <div className="button-container">
        <Button name="Купить" />
      </div>
      <div className="button-container">
        <Button name="Заказать" />
      </div>
      <div className="button-container">
        <Button name="Продать" />
      </div> */}
      {buttons}
    </div>
  );
}

export default App;
