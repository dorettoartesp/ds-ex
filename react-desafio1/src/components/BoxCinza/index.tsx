import { NavLink } from 'react-router-dom';
import styles from './styles.module.scss';
export const BoxCinza = () => {
  return (
    <>
        <div className={`d-flex flex-row align w-full justify-content-center ${styles["box-cinza"]}`}>
            <div className={styles["box-container"]}>
                <div className={styles["btn-catalogo"]}>
                    <NavLink to='/catalogo' className={styles.btn__text}>
                        ver catálogo
                    </NavLink>
                </div>
                <div className={styles.title}>
                    <span className=''></span>Comece agora a navegar
                </div>
            </div>
        </div>
    </>
  )
}
