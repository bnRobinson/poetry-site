import { useState, useEffect } from 'react'

import './App.css'
import addPoem from './Pages/AddPoem.js'
import addWriting from './Pages/AddWriting.js'
import loginForm from './Pages/LoginForm.js'
import searchWritingForm from './Pages/SearchWritingForm.js'
import displayCode from './Pages/DisplayCode.js'
import displayPoems from './Pages/DisplayPoems.js'
import displayWriting from './Pages/DisplayWriting.js'
import homePage from './Pages/HomePage.js'
import registrationForm from './Pages/RegistrationForm.js'


function App() {
  const [count, setCount] = useState(0)

  return (
    <div className='App'>
      <BrowserRouter>
      <Route path="/" element={<homePage/>}/>
      <Route path="/AddPoem" element={<addPoem/>}/>
      <Route path="/AddWriting" element={<addWriting/>}/>
      <Route path="/LoginForm" element={<loginForm/>}/>
      <Route path="/RegistrationForm" element={<registrationForm/>}/>
      <Route path="/SearchWritingForm" element={<searchWritingForm/>}/>
      <Route path="/Displaycode" element={<displayCode/>}/>
      <Route path="/DisplayPoems" element={<displayPoems/>}/>
      <Route path="/DisplayWriting" element={<displayWriting/>}/>

      </BrowserRouter>
      
    </div>
  )
}

export default App
