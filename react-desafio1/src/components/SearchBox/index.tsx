import styles from './styles.module.scss'

export const SearchBox = () => {
  return (
    <div className="row mt-4 px-2">
        <div className={styles.box}>
            <div className={styles.box__input}>
                <input type="text" placeholder='Digite sua busca'/>
            </div>
            <div className={styles.box__btn}>
                Buscar
            </div>
        </div>
    </div>
  )
}
