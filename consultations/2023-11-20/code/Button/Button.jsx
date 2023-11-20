import "./styles.css";

function Button({ type = "button", name, children }) {
  console.log(type);
  console.log(name);
  return (
    <button className="button-componet" type="type">
      {name ?  name : children}
    </button>
  );
}

export default Button;
