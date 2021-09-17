import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import ReactDOM from "react-dom";
import { BrowserRouter as Router, Route } from 'react-router-dom';
// import { HashRouter as Router, Route } from 'react-router-dom';
import Header from './component/Header';
import Login from './component/Login';
import Register from './component/Register';
import Cuisine from './component/Cuisine';
import Home from './component/Home';
import Test from './component/Test';
import { Carousel } from 'bootstrap';
import RegistrationForm from './component/RegistrationForm';
import RegistrationForm2 from './component/RegistrationForm copy';

function App() {
  return (
    <Router>
      <div>
        <Header />
        <Route path="/login" component={Login}/>
        <Route path="/register" component={RegistrationForm} />
        <Route path="/cuisines" component={Cuisine} />
        {/* <Home /> */}
        {/* <Test /> */}
      </div>
    </Router>

  );
}

export default App;
