import { Card } from '../Card';
import styles from './styles.module.scss';

type propTypes = {
  n: number
}

export const CardList = ({n = 6}: propTypes) => {
  return (
    <div className="row">
        {
          [
            ...Array(n),
          ].map((value: undefined, index: number) => (
            <Card key={index} />
          ))
        }
    </div>
  )
}
