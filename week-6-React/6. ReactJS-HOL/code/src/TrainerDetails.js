import React from 'react';
import { useParams } from 'react-router-dom';

const TrainerDetail = ({ trainers }) => {
  const { id } = useParams();
  const trainer = trainers.find(t => t.id === id);

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div style={{ border: '1px solid black', padding: '10px', width: 'fit-content' }}>
      <h3><strong>Trainers Details</strong></h3>
      <p><strong>{trainer.name} ({trainer.specialization})</strong></p>
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>
      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
};

export default TrainerDetail;
