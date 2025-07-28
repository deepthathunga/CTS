import React from 'react';

const TrainersList = ({ trainers }) => {
  return (
    <div style={{ border: '1px solid black', padding: '10px', width: '200px' }}>
      <h3><strong>Trainers List</strong></h3>
      <ul>
        {trainers.map((trainer, index) => (
          <li key={index}>
            <a href="#">{trainer.name}</a>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TrainersList;
