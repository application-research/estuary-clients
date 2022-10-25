=begin comment

Estuary API

This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test cases below to test the API endpoints.
# Ref: https://github.com/swagger-api/swagger-codegen
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::PeersApi');

my $api = WWW::SwaggerClient::PeersApi->new();
isa_ok($api, 'WWW::SwaggerClient::PeersApi');

#
# admin_peering_peers_delete test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->admin_peering_peers_delete(body => $body);
}

#
# admin_peering_peers_get test
#
{
    my $result = $api->admin_peering_peers_get();
}

#
# admin_peering_peers_post test
#
{
    my $result = $api->admin_peering_peers_post();
}

#
# admin_peering_start_post test
#
{
    my $result = $api->admin_peering_start_post();
}

#
# admin_peering_status_get test
#
{
    my $result = $api->admin_peering_status_get();
}

#
# admin_peering_stop_post test
#
{
    my $result = $api->admin_peering_stop_post();
}


1;
