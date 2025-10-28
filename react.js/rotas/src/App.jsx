import './App.css'
import {Router, Routes, Route } from 'react-router-dom'
import Header from './components/Header'
import Footer from './components/Footer'
import HomePage from './pages/HomePage'
import AddFuncionarioPage from './pages/AddFuncionarioPage'
import ListarFuncionarioPage from './pages/ListarFuncionarioPage'

function App() {
  return (
    <Router>
      <Header />
      <main>
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/cadastrar" element={<AddFuncionarioPage />} />
          <Route path="/listar" element={<ListarFuncionarioPage />} />
        </Routes>
      </main>
      <Footer />
    </Router>
  )
}

export default App
