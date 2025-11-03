import { useState } from 'react'
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import { Route, Routes } from 'react-router-dom'
import SobreNos from './pages/SobreNosPage'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header />
      <main>
        <Routes>
          <Route path='/' element />
          <Route path='/sobre-nos' element={<SobreNos />} />
          <Route >
        </Routes>
      </main>
      <Footer />
    </>
  )
}

export default App
