import "./styles.css";

function CounterInterval({ count, onClick }) {
  return (
    <div className="counter-interval">
      {count}
      <button onClick={onClick}>Запустить счетчик</button>
    </div>
  );
}

export default CounterInterval;
