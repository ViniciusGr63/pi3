import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
//estyles
import './App.css';
//pages
import HomePage from './components/pages/home/HomePage';
import Categoria from './components/pages/home/Categoria';
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
          <Route path="/Categoria" element={<Categoria />} />
          <Route path="/LoginPage" element={<LoginPage />} />
          <Route path="/QuemSomos" element={<QuemSomos />} />
        </Routes>  
      </Router>
    </div>
  );
}

export default App;
