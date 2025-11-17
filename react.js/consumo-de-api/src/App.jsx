import { useState } from 'react'
import './App.css'
import { Route, Routes } from 'react-router-dom'

import Header from './components/Header'
import Footer from './components/Footer'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaPage from './pages/ListaPage'
import { ToastContainer } from 'react-toastify'

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
      <ToastContainer position='top-right' autoClose={3000} />
    </>
  )
}

export default App
