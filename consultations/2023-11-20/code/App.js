import Button from "./components/Button";

import "./App.css";

function App() {
  const numbers = [1, 2, 3, 4, 5];

  const inputs = numbers.map((value) => {
    return (
      <div key={`${value}-${new Date()}`}>
        <div className="button-control">
          <Button type="submit" name="Submit" />
        </div>
        <input placeholder={value} />
      </div>
    );
  });

  return (
    <div className="App">
      {inputs}
      <div className="button-control">
        <Button type="submit" name="Submit" />
      </div>
      <div className="button-control">
        <Button type="submit" name="Order" />
      </div>
      <div className="button-control">
        <Button>Create</Button>
      </div>
    </div>
  );
}

export default App;
