import './index.scss';
export const BoxAzul = () => {
  return (
    <>
        <div className="d-flex flex-column w-full box-azul">
            <div className='image-container'>
                <img src="/src/assets/images/car-header.png" alt="" />
            </div>
            <div className='title'>
                O carro perfeito para você
            </div>
            <div className='subtitle'>
                Conheça nossos carros e dê mais um passo na realização do seu sonho
            </div>
        </div>
    </>
  )
}
