# app.rb
require 'sinatra'

set :public_folder, File.dirname(__FILE__) + '/public'

before do
  headers 'Access-Control-Allow-Origin' => '*'
end
  
get '/' do
  'Error: URL Vacía'
end