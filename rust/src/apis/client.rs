use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  admin_api: Box<::apis::AdminApi>,
  autoretrieve_api: Box<::apis::AutoretrieveApi>,
  collections_api: Box<::apis::CollectionsApi>,
  content_api: Box<::apis::ContentApi>,
  deals_api: Box<::apis::DealsApi>,
  metrics_api: Box<::apis::MetricsApi>,
  miner_api: Box<::apis::MinerApi>,
  net_api: Box<::apis::NetApi>,
  peering_api: Box<::apis::PeeringApi>,
  peers_api: Box<::apis::PeersApi>,
  pinning_api: Box<::apis::PinningApi>,
  public_api: Box<::apis::PublicApi>,
  user_api: Box<::apis::UserApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      admin_api: Box::new(::apis::AdminApiClient::new(rc.clone())),
      autoretrieve_api: Box::new(::apis::AutoretrieveApiClient::new(rc.clone())),
      collections_api: Box::new(::apis::CollectionsApiClient::new(rc.clone())),
      content_api: Box::new(::apis::ContentApiClient::new(rc.clone())),
      deals_api: Box::new(::apis::DealsApiClient::new(rc.clone())),
      metrics_api: Box::new(::apis::MetricsApiClient::new(rc.clone())),
      miner_api: Box::new(::apis::MinerApiClient::new(rc.clone())),
      net_api: Box::new(::apis::NetApiClient::new(rc.clone())),
      peering_api: Box::new(::apis::PeeringApiClient::new(rc.clone())),
      peers_api: Box::new(::apis::PeersApiClient::new(rc.clone())),
      pinning_api: Box::new(::apis::PinningApiClient::new(rc.clone())),
      public_api: Box::new(::apis::PublicApiClient::new(rc.clone())),
      user_api: Box::new(::apis::UserApiClient::new(rc.clone())),
    }
  }

  pub fn admin_api(&self) -> &::apis::AdminApi{
    self.admin_api.as_ref()
  }

  pub fn autoretrieve_api(&self) -> &::apis::AutoretrieveApi{
    self.autoretrieve_api.as_ref()
  }

  pub fn collections_api(&self) -> &::apis::CollectionsApi{
    self.collections_api.as_ref()
  }

  pub fn content_api(&self) -> &::apis::ContentApi{
    self.content_api.as_ref()
  }

  pub fn deals_api(&self) -> &::apis::DealsApi{
    self.deals_api.as_ref()
  }

  pub fn metrics_api(&self) -> &::apis::MetricsApi{
    self.metrics_api.as_ref()
  }

  pub fn miner_api(&self) -> &::apis::MinerApi{
    self.miner_api.as_ref()
  }

  pub fn net_api(&self) -> &::apis::NetApi{
    self.net_api.as_ref()
  }

  pub fn peering_api(&self) -> &::apis::PeeringApi{
    self.peering_api.as_ref()
  }

  pub fn peers_api(&self) -> &::apis::PeersApi{
    self.peers_api.as_ref()
  }

  pub fn pinning_api(&self) -> &::apis::PinningApi{
    self.pinning_api.as_ref()
  }

  pub fn public_api(&self) -> &::apis::PublicApi{
    self.public_api.as_ref()
  }

  pub fn user_api(&self) -> &::apis::UserApi{
    self.user_api.as_ref()
  }


}
