
import { BrowserRouter, Routes,Route } from 'react-router-dom';
import './App.css';
import { Logo } from './components/Logo';
import { Menu } from './components/Menu';
import { Home } from './components/Home';



function App() {
  return (
    <div className="App">
            <BrowserRouter>
      <Logo/>
      <Menu/>

      <Routes>
        <Route path="/" element={<Home />}/>

      </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
