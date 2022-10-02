import './index.scss'
import 'bootstrap/js/src/collapse.js';

import { ReactComponent as Hamburger } from '../../assets/images/hamburger.svg';
import { NavLink } from 'react-router-dom';

export const Navbar = () => {
  return (
    <>
      <nav className="navbar navbar-expand-md bg-primary">
        <div className="container-fluid">
          <a className="navbar-brand text-secondary" href="#">
            Carros Top
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarToggle"
            aria-controls="navbarToggle"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <Hamburger />
          </button>
          <div className="collapse navbar-collapse" id="navbarToggle">
            <ul className="navbar-nav offset-md-2 main-menu">
              <li className="nav-item">
                <NavLink className={`nav-link ${ navData => navData.isActive ? 'active' : ''}`} aria-current="page" to='/' end>
                  Home
                </NavLink>
              </li>
              <li className="nav-item">
                <NavLink className={`nav-link ${ navData => navData.isActive ? 'active' : ''}`} aria-current="page" to='/catalogo'>
                  Catálogo
                </NavLink>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </>
  );}