import { useState } from "react";

import "./App.css";
import Lesson18 from "./lessons/Lesson18";
import Text from "./components/Text";
import CounterInterval from "./components/CounterInterval";

function App() {
  const [timerMessage, setTimerMessage] = useState();
  const [count, setCount] = useState(0);

  const timerHandler = (ms) => {
    setTimeout(() => {
      setTimerMessage(`Прошло ${ms} миллисекунд`);
    }, ms);
  };

  const counterIntervalHandler = () => {
    const intervalId = setInterval(() => {
      setCount((prevValue) => {
        const newValue = prevValue + 1;

        if (newValue === 3) {
          clearInterval(intervalId);
        }

        return newValue;
      });
    }, 1000);
  };

  return (
    <div className="App">
      {/* Использовать Lessons только во время обучения,
      когда начнем писать проект, такой структуры у нас не будет */}
      {/* <Lesson18 /> */}
      {timerMessage && <Text>{timerMessage}</Text>}
      <button onClick={() => timerHandler(3000)}>Запустить таймер</button>
      <CounterInterval count={count} onClick={counterIntervalHandler} />
    </div>
  );
}

export default App;
