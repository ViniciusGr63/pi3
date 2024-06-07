import React from 'react';
import Style from './Categoria.css';

const products = [
    { id: 1, name: 'Vestido estampado Viscose', price: 'R$379', image: 'https://lojafarm.vteximg.com.br/arquivos/ids/3288418/323848_46304_2-BATA-MANGA-LONGA-ESTAMPADA-HELENA.jpg?v=638429088309600000' },
    { id: 2, name: 'Camisata CLASSIC Algodão', price: 'R$147', image: 'https://lojafarm.vteximg.com.br/arquivos/ids/3269090-472-708/328209_0013_1-BLUSA-T-SHIRT-COM-OMBREIRA-REMOVIVEL.jpg?v=638411333787670000' },
    { id: 3, name: 'Camisa de linho de manga longa', price: 'R$83,90', image: 'https://cdn.awsli.com.br/2500x2500/1330/1330260/produto/266807907/44-xup995l5w9.JPG' },
    { id: 4, name: 'Vestido em Liocel Azul', price: 'R$159,90', image: 'https://lojafarm.vteximg.com.br/arquivos/ids/3308849-472-708/324089_46289_1-VESTIDO-CURTO-LENCO-ESTAMPADO-MAGIA-TROPICAL.jpg?v=638446564836730000' },
    { id: 5, name: 'Vestido preto tubinho canelado Poliamida', price: 'R$85,90', image: 'https://vivolle.com.br/cdn/shop/files/adais6.jpg?v=1710720858&width=1500' },
    { id: 6, name: 'Jaqueta Retro Poliéster reciclado', price: 'R$1.542', image: 'https://lojafarm.vteximg.com.br/arquivos/ids/3137854-472-708/313981_02015_1-JAQUETA-GOLA-SARJA.jpg?v=638254828055400000' },
  ];
  
function CategoriaRoupa (){
    return(
       
            <div className="categoria-roupa">
              <h2>ROUPAS</h2>
              <div className="grid">
                {products.map(product => (
                  <div key={product.id} className="product-card">
                    <img src={product.image} alt={product.name} />
                    <div className="product-info">
                      <h3>{product.name}</h3>
                      <p>{product.price}</p>
                    </div>
                  </div>
                ))}
              </div>
            </div>
    )
}
export default CategoriaRoupa;

