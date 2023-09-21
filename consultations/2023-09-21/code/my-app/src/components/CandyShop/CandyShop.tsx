import React from 'react';
import Candy from '../Candy/Candy';

export default function CandyShop():JSX.Element {
  return (
    <div>
      <h1>CandyShop</h1>
      <Candy title="m&m's" price={2.5} />
      <Candy title="mars" price={1.5} />
      <Candy title="snickers" price={1.7} />
    </div>
  );
}
