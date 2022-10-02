import { CardList } from "../components/CardList"
import { SearchBox } from "../components/SearchBox"


export const CatalogoPage = () => {
  return (
    <div className="container">
      <SearchBox />
      <CardList n={6} />
    </div>
  )
}
