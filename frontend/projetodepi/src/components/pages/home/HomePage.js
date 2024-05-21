import styles from './HomePage.module.css'

import LogoReciclar from './../../../assets/images/reciclar.png'
import LogoCoelho from './../../../assets/images/coelho.png'
import LogoArtesanal from './../../../assets/images/artesanal.png'
import LogoVegan from './../../../assets/images/vegan.png'



function HomePage (){
    return(
        <>
        <div className={styles.HomePage}>  

        <div className={styles.SuperiorContent}> 
        
        
        <div className={styles.CenterContent}>
            <p>Com a gente você 
se torna consciente
do seu consumo.</p>

        </div>
         </div >
           
        

      


            <h1 className={styles.valoresTitle}>NOSSOS VALORES</h1>
            <div className={styles.valores}>

            <img  src={LogoCoelho} alt="Cruelty-free" title="Cruelty-free"/>
            <img  src={LogoVegan} alt="Vegan" title="Vegan" />
            <img  src={LogoReciclar} alt="Recyclable" title="Recyclable"/>
            <img  src={LogoArtesanal} alt="Handmade" title="Handmade"/>
            </div>
   
        </div>
        </>
        
    )
}
export default HomePage;

