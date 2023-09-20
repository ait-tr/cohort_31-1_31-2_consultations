import React from 'react';

import style from './Panda.module.css';
import pandaImage from './img/panda.jpeg';

export default function Panda():JSX.Element {
  return (
    <div className={style.container}>
      <h1 className={style.heading}>Panda</h1>
      <p className={style.description}>Информация про панду</p>
      <h2>Первый способ использования картинок - через импорт</h2>
      <img src={pandaImage} alt="panda" />
      <h2>Второй способ использования картинок - через папку паблик</h2>
      <img src="/panda.jpeg" alt="panda" />
      {/* слеш без точки - указывает на папку паблик */}
      <h2>Третий способ ссылкой на ресурс</h2>
      <img src="https://media.istockphoto.com/id/177841009/nl/foto/baby-giant-panda-on-the-tree.jpg?s=612x612&w=0&k=20&c=60O4IQP5ThIdYPwuQ_CH20HaQP8dsm4k1wP6AXlvSQE=" alt="" />
    </div>
  );
}
