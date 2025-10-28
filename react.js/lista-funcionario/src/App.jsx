import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Funcionario from './components/Funcionario'
import Footer from './components/Footer'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header/>
      <Funcionario/>
      <Footer/>
    </>
  )
}

export default App
