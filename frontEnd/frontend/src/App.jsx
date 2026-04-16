import React from 'react'
import { BrowserRouter, Routes, Route,Navigate } from 'react-router-dom'
import Footer from './components/Footer'
import Login from './components/Login'
import Header from './components/Header'
import './App.css';
import EmployeeList from './components/EmployeeList'
import CreateEmployee from './components/CreateEmployee'
import UpdateEmployee from './components/UpdateEmployee'

function PrivateRoute({ children }) 
{
  return localStorage.getItem("logged") ? children : <Navigate to="/login" />;
}

function App() {
  return (
    <div className="bg-color">

          <BrowserRouter>
            <Header/>
              <Routes>
                  <Route exact path='/login' element={<Login/>}></Route>
        
         {/* protected pages */ }
        <Route path="/" element={<PrivateRoute><EmployeeList/></PrivateRoute>}/>
        <Route path="/add-emp" element={<PrivateRoute><CreateEmployee/></PrivateRoute>}/>
        <Route path='/update-emp/:id' element={<PrivateRoute><UpdateEmployee/></PrivateRoute>}></Route>

              </Routes>
            <Footer/>
          </BrowserRouter>
    </div>
  )
}

export default App;

