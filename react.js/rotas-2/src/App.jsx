import { useState } from 'react'
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header />
      <h1>SENAI</h1>
      <Footer/>
    </>
  )
}

export default App
