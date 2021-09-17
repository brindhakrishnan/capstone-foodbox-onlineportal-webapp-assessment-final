import React from 'react'
import { NavLink } from 'react-router-dom'

export default function Nav() {
    return (
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
            <a className="navbar-brand" href="#">
                <img src="./FoodBox_logo2.png" width="350" height="75" alt="" />
            </a>
            <div className="collapse navbar-collapse" id="navbarText">
                <ul className="navbar-nav mr-auto">
                    <li className="nav-item active">
                        <NavLink className="nav-link" to="/" exact>Home <span className="sr-only">(current)</span></NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/cuisines">Cuisines</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/menu">Menu</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/offers">Offers</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/help">Help</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/about">About</NavLink>
                    </li>
                </ul>
            </div>
        </nav>
    )

}