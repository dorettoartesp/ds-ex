import '@/assets/styles/custom.scss';
import '@/CarrosTopApp.css';
import { IndexPage, CatalogoPage } from './pages';
import { Route, Routes } from 'react-router-dom';

import { Navbar } from './components/Navbar';

export const CarrosTopApp = () => {
  return (
    <>
      <Navbar />
      <Routes>
        <Route path='/' element={<IndexPage />} />
        <Route path='/catalogo' element={<CatalogoPage />} />
      </Routes>
    </>
  );
}
