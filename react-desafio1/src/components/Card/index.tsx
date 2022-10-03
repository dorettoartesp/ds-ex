import styles from './styles.module.scss'
import Car from '/src/assets/images/car-card.png';

export const Card = () => {
  return (
    <div className="col-6 col-lg-4 mt-4">
      <div className={styles.box}>
        <div className={styles.box__img}>
          <img src={Car} alt="" />
        </div>
        <div className={styles.box__title}>
          Audi Supra TT
        </div>
        <div className={styles.box__subtitle}>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Iste quod numquam ex atque animi.
        </div>
        <div className={styles.box__btn}>
          comprar
        </div>
      </div>
    </div>
  )
}
