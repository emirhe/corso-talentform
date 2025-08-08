import React, { useEffect, useState } from 'react';

type NegozioModel = {
  id: number;
  tipologia: string;
  caratteristiche: string[];
  prezzo: number;
  quantita: number;
  brand: string;
};

const NegozioList: React.FC = () => {
  const [negozio, setNegozio] = useState<NegozioModel[]>([]);

  useEffect(() => {
    fetch('/api/negozio')
      .then(response => {
        if (!response.ok) {
          throw new Error('Errore nella fetch');
        }
        return response.json();
      })
      .then(data => setNegozio(data))
      .catch(error => console.error('Errore:', error));
  }, []);

  return (
    <div>
      <h2>Lista Prodotti - Negozio Abbigliamento</h2>
      {negozio.map(negozio => (
        <div key={negozio.id} style={{ border: '1px solid gray', margin: '8px', padding: '8px' }}>
          <p><strong>ID:</strong> {negozio.id}</p>
          <p><strong>Tipologia:</strong> {negozio.tipologia}</p>
          <p><strong>Caratteristiche:</strong> {negozio.caratteristiche.join(', ')}</p>
          <p><strong>Prezzo:</strong> {negozio.prezzo}</p>
          <p><strong>Quantità:</strong> {negozio.quantita}</p>
          <p><strong>Brand:</strong> {negozio.brand}</p>
        </div>
      ))}
    </div>
  );
};

export default NegozioList;