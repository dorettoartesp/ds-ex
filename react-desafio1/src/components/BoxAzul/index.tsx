import styles from './styles.module.scss';
export const BoxAzul = () => {
  return (
    <>
        <div className={`d-flex flex-column w-full ${styles['box-azul']}`}>
            <div className={styles['image-container']}>
                <img src="/src/assets/images/car-header.png" alt="" />
            </div>
            <div className={styles.title}>
                O carro perfeito para você
            </div>
            <div className={styles.subtitle}>
                <div className={styles.subtitle__text}>
                    Conheça nossos carros e dê mais um passo na realização do seu sonho
                </div>
            </div>
        </div>
    </>
  )
}
