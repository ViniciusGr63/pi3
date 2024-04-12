import styles from './Nav.module.css';

import { Link } from 'react-router-dom';


function Nav (){
    return(
        <nav >
           
        <ul className={styles.navEstilo}>
        <li className={styles.item}><Link to="/">Home</Link></li>
        <li className={styles.item}><Link to="/Categoria">Categoria</Link></li>
        <li className={styles.item}><Link to="/LoginPage">Login</Link></li>
        <li className={styles.item}><Link to="/QuemSomos">Quem somos</Link></li>
        

      </ul>
    
           
        </nav>
    )
}
export default Nav;