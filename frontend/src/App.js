import React from 'react';
import { Layout, Typography } from 'antd';
import OrderNotification from './components/OrderNotification';
import './App.css';

const { Header, Content, Footer } = Layout;
const { Title } = Typography;

function App() {
  return (
    <Layout className="app-layout">
      <Header className="app-header">
        <Title level={3} style={{ color: 'white', margin: 0 }}>
          订单实时通知系统
        </Title>
      </Header>
      <Content className="app-content">
        <OrderNotification />
      </Content>
      <Footer className="app-footer">
        SSE 示例应用 ©{new Date().getFullYear()} 由 SpringBoot 2.7.5 + React 提供支持
      </Footer>
    </Layout>
  );
}

export default App;
