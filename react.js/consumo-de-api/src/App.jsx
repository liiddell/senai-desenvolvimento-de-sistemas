import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import { Route, Routes } from 'react-router-dom'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaPage from './pages/ListaPage'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header/>
      <main>
        <Routes>
          <Route path='/' element={<HomePage/>}/>
          <Route path='/cadastro' element={<CadastroPage/>}/>
          <Route path='/usuarios' element={<ListaPage/>}/>
        </Routes>
      </main>
      <Footer/>
    </>
  )
}

export default App
