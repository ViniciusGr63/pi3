import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
//estyles
import './App.css';
//pages
import HomePage from './components/pages/home/HomePage';
import CategoriaRoupa from './components/pages/categoria/CategoriaRoupa';
import CategoriaAcessorio from './components/pages/categoria/CategoriaAcessorio';
import CategoriaCalcado from './components/pages/categoria/CategoriaCalcado';
import CategoriaCosmetico from './components/pages/categoria/CategoriaCosmetico';
import QuemSomos from './components/pages/home/QuemSomos';
import LoginPage from './components/pages/login/LoginPage';
//components
import Header from './components/pages/home/Header';


function App() {
  return (
    <div className="App">
     
      <Router>    
        <Header/>
        

        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/CategoriaRoupa" element={<CategoriaRoupa />} />
          <Route path="/CategoriaAcessorio" element={<CategoriaAcessorio />} />
          <Route path="/CategoriaCalcado" element={<CategoriaCalcado />} />
          <Route path="/CategoriaCosmetico" element={<CategoriaCosmetico />} />
          <Route path="/LoginPage" element={<LoginPage />} />
          <Route path="/QuemSomos" element={<QuemSomos />} />
        </Routes>  
      </Router>
    </div>
  );
}

export default App;
