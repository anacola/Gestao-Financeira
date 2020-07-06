import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Input from './components/input/input.js';
import Button from './components/button/index.js'

function App() {

  //const [user, setUser] = useState('');
  //const [password, setPassword] = useState('';)


  function userLogin() {
    console.log("ta indo");

  } 
  
  return (

   
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Input id='login-client' type="text" placeholder={'Usuário'} /*state={user}*//>
        <Input id='password-client' type="text" placeholder={'Senha'} /*state={password}*//>

        <Button
          className={'btn-send-login'}
          text={'Enviar'}
          handleClick={(e) => {
            e.preventDefault()
            userLogin()
          }}
         />

        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
