import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Counter from './Counter/Counter';
import CityPage from './CityPage/CityPage';
import Sandwich from './Sandwich/Sandwich';
import CarShop from './CarShop/CarShop';
import CandyShop from './components/CandyShop/CandyShop';
import DogEffect from './components/DogEffect/DogEffect';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <>
    <App />
    <Counter />
    <CityPage />
    <Sandwich />
    <CarShop />
    <CandyShop />
    <DogEffect />
  </>
);
