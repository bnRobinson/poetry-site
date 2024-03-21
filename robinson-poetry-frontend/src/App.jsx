import { useState, useEffect } from 'react'

import './App.css'
import addPoem from './Pages/AddPoem'
import addWriting from './Pages/AddWriting'
import loginForm from './Pages/LoginForm'
import searchWritingForm from './Pages/SearchWritingForm'
import displayCode from './Pages/DisplayCode'
import displayPoems from './Pages/DisplayPoems'
import displayWriting from './Pages/DisplayWriting'
import homePage from './Pages/HomePage'


function App() {
  const [count, setCount] = useState(0)

  return (
    <div className='App'>
      <BrowserRouter>
      <Route path="/" element={<homePage/>}/>
      <Route path="/AddPoem" element={<addPoem/>}/>
      <Route path="/AddWriting" element={<addWriting/>}/>
      <Route path="/LoginForm" element={<loginForm/>}/>
      <Route path="/SearchWritingForm" element={<searchWritingForm/>}/>
      <Route path="/Displaycode" element={<displayCode/>}/>
      <Route path="/DisplayPoems" element={<displayPoems/>}/>
      <Route path="/DisplayWriting" element={<displayWriting/>}/>

      </BrowserRouter>
      
    </div>
  )
}

export default App
