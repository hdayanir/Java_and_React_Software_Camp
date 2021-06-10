import React ,{useState} from 'react'
import CartSummary from './CartSummary'
import { Container, Menu } from 'semantic-ui-react'
import SignedOut from './SignedOut'
import SignedIn from './SignedIn'
import { useHistory } from 'react-router'

export default function Navi() {
  const [isAuthenticated, setisAuthenticated] = useState(true) //giris yapip yapilmadigi belirlenip signin mi signout mu gorunecek onu belirliyor
  const history = useHistory()
  function handleSignOut() {
    setisAuthenticated(false) //cikisyap degistirmis oluyoruz
    history.push("/")
    //usehistory :cikis yaptiktan sonra herhangi bir alt domainde kalmasini istemiyoruz. ana sayfaya yonlendiriyoruz
  }  
  function handleSignIn() {
    setisAuthenticated(true) //giris yap degistirmis oluyoruz
  } 
  return (
    <div>
      <Menu inverted fixed="top">
        <Container>
          <Menu.Item name="home" />
          <Menu.Item name="messages" />

          <Menu.Menu position="right">
            <CartSummary/>
            {isAuthenticated?<SignedIn signOut={handleSignOut} bisey="1"/>
            :<SignedOut signIn={handleSignIn}/>}  
          </Menu.Menu>
        </Container>
      </Menu>
    </div>
  );
}